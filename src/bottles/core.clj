(ns bottles.core
  "Outputs parts or whole '99 Bottles of Beer' song."
  (:gen-class)
  (:require
   [clojure.string :as string]))

(defn quantity
  [number]
  (case number
    6 "1"
    0 "no more"
    number))

(defn- container
  [number]
  (case number
    6 " six-pack"
    1 " bottle"
    " bottles"))

(defn- num-containers [number]
  (str (quantity number) (container number)))

(defn- pronoun
  [number]
  (if (= 1 number)
    "it"
    "one"))

(defn- action
  [number]
  (if (= 0 number)
    "Go to the store and buy some more"
    (format
     "Take %s down and pass it around"
     (pronoun number))))

(defn verse
  "Returns the verse `number` of the song."
  [number]
  (case number
    0 (format "%s of beer on the wall, %s of beer.
%s, 99 bottles of beer on the wall."
              (string/capitalize (num-containers number))
              (num-containers number)
              (action number))

    (format "%s of beer on the wall, %s of beer.
%s, %s of beer on the wall."
            (string/capitalize (num-containers number))
            (num-containers number)
            (action number)
            (num-containers (dec number)))))

(defn verses
  "Returns a range of verses from start to finish, inclusive.
  Defaults to whole song."
  ([]
   (verses 99 0))
  ([start finish]
   (->> start
        inc
        (range finish)
        reverse
        (map verse)
        (string/join "\n"))))

(defn song
  "Returns the whole song."
  []
  (verses))

(defn -main
  ([]
   (println (song)))
  ([number]
   (-> number
       Integer/parseInt
       verse
       println))
  ([start finish]
   (let [s (Integer/parseInt start)
         f (Integer/parseInt finish)]
     (println (verses s f)))))
