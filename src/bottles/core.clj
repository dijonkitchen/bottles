(ns bottles.core
  "Outputs parts or whole '99 Bottles of Beer' song."
  (:gen-class)
  (:require
   [bottles.bottle-number :as bn]
   [clojure.string :as string]))

(defn verse
  "Returns the verse `number` of the song."
  [number]
  (format "%s of beer on the wall, %s of beer.
%s, %s of beer on the wall."
          (string/capitalize (bn/num-containers number))
          (bn/num-containers number)
          (bn/action number)
          (bn/num-containers (bn/successor number))))

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
