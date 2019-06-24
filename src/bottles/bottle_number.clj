(ns bottles.bottle-number
  "Functions related to the number of bottles.")

(def container-size 6)

(defn- even-container?
  [number]
  (= 0 (mod number container-size)))

(defn- quantity
  [number]
  (cond
    (= 0 number)             "no more"
    (= 6 number)             "1"
    (even-container? number) (str (/ number container-size))
    :else                    (str number)))

(defn- container
  [number]
  (cond
    (= 0 number)             "bottles"
    (= 1 number)             "bottle"
    (= 6 number)             "six-pack"
    (even-container? number) "six-packs"
    :else                    "bottles"))

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
