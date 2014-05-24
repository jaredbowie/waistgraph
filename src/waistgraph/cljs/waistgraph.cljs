(ns modern-cljs.modern
  (:require [domina :refer [by-id]])
  )

(.write js/document "Hello, ClojureScript!")

(defn make-test-graph []
  (let [ctx (by-id "myChart")]
    (. js/console (log ctx))
    )
  )

(set! (.-onload js/window) make-test-graph)

;var ctx = document.getElementById("myChart").getContext("2d");
;var myNewChart = new Chart(ctx).PolarArea(data)
                                        ;
