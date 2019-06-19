(ns bottles.core
  "Outputs parts or whole '99 Bottles of Beer' song."
  (:gen-class)
  (:require
   [clojure.string :as string]))

(defn- num-containers [number]
  (case number
    6 "1 six-pack"
    1 "1 bottle"
    0 "no more bottles"
    (str number " bottles")))

(defn verse
  "Returns the verse `number` of the song."
  [number]
  (case number
    0 "No more bottles of beer on the wall, no more bottles of beer.
Go to the store and buy some more, 99 bottles of beer on the wall."

    (format "%s of beer on the wall, %s of beer.
Take %s down and pass it around, %s of beer on the wall."
            (num-containers number)
            (num-containers number)
            (if (= 1 number) "it" "one")
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
