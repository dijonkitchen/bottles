(ns bottles.core
  "Outputs parts or whole '99 Bottles of Beer' song."
  (:gen-class)
  (:require
   [clojure.string :as string]))

(defn verse
  "Returns the verse `number` of the song.
  Defaults to whole song."
  ([]
   (verse 99 0))
  ([number]
   (case number
     2  "2 bottles of beer on the wall, 2 bottles of beer.
Take one down and pass it around, 1 bottle of beer on the wall."
     1  "1 bottle of beer on the wall, 1 bottle of beer.
Take it down and pass it around, no more bottles of beer on the wall."
     0 "No more bottles of beer on the wall, no more bottles of beer.
Go to the store and buy some more, 99 bottles of beer on the wall."
     (format "%s bottles of beer on the wall, %s bottles of beer.
Take one down and pass it around, %s bottles of beer on the wall."
             number
             number
             (dec number))))
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
  (verse))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
