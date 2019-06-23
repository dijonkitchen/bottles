(ns bottles.bottle-number
  "Functions related to the number of bottles.")

(defn- quantity
  [number]
  (case number
    6 "1"
    0 "no more"
    (str number)))

(defn- container
  [number]
  (case number
    6 "six-pack"
    1 "bottle"
    "bottles"))

(defn num-containers [number]
  (str (quantity number)
       " "
       (container number)))

(defn- pronoun
  [number]
  (if (= 1 number)
    "it"
    "one"))

(defn action
  [number]
  (if (= 0 number)
    "Go to the store and buy some more"
    (format
     "Take %s down and pass it around"
     (pronoun number))))

(defn successor [number]
  (if (= 0 number)
    99
    (dec number)))
