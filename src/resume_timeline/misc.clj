(ns resume-timeline.misc)

(defn adder
  "Parses (adder 1 3 + 5) => 9"
  [& args]
  (let [split-num  (split-at (- (count args) 2) args)]
    (reduce (-> split-num last first)
            (flatten (conj (first split-num)
                           (-> split-num last rest))))))

(adder 1
       2
       3
     + 5)
     
       
