(ns resume-timeline.test.bsttest
  (:use clojure.test
        ring.mock.request  
        resume-timeline.bst))

(declare make-balanced-tree)

(deftest tree-search
  (is (= :false (in-tree? 9 (make-balanced-tree))))
  (is (= :false (in-tree? 9 nil)))
  (is (= :true (in-tree? 7 (make-balanced-tree)))))

(deftest tree-insert
  (is (= (make-node 5 :black) (insert 5)))
  #_(is (= (make-node 5 :black (make-node 3 :red)) (insert 3 (insert 5)))))

(deftest tree-invariant-checking
  (is (= (:false (needs-rotation? (insert 5))))))


(defn make-balanced-tree []
  (make-node 8 :black
      (make-node 3 :red
          (make-node 1 :black)
          (make-node 6 :black
              (make-node 4 :red)
              (make-node 7 :red)))
      (make-node 10 :red
          nil
          (make-node 14 :black
              (make-node 13 :red)))))
