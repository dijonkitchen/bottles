(ns bottles.bottle-number
  "Functions related to the number of bottles.")

(def container-size 6)

(def case-size (* 4 container-size))

(defn- even-container?
  [number]
  (zero? (mod number container-size)))

(defn- even-case?
  [number]
  (zero? (mod number case-size)))

(defn- quantity
  [number]
  (cond
    (zero? number)            "no more"
    (= container-size number) "1"
    (even-case? number)       (str (/ number case-size))
    (= case-size number)      "1"
    (even-container? number)  (str (/ number container-size))
    :else                     (str number)))

(defn- container
  [number]
  (cond
    (zero? number)            "bottles"
    (= 1 number)              "bottle"
    (= case-size number)      "case"
    (even-case? number)       "cases"
    (= container-size number) "six-pack"
    (even-container? number)  "six-packs"
    :else                     "bottles"))

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
  (if (zero? number)
    "Go to the store and buy some more"
    (format
     "Take %s down and pass it around"
     (pronoun number))))

(defn successor [number]
  (if (zero? number)
    99
    (dec number)))
