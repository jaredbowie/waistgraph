(ns modern-cljs.modern
  (:require [domina :refer [by-id]])
  )

(.write js/document "Hello, ClojureScript!")

(def data
  {:labels ["January","February","March","April","May","June","July"]
   :datasets [{:fillColor "rgba(220,220,220,0.5)"
               :strokeColor "rgba(220,220,220,1)",
               :pointColor "rgba(220,220,220,1)",
               :pointStrokeColor "#fff",
               :data [65,59,90,81,56,55,40]
               }
              	{
                 :fillColor "rgba(151,187,205,0.5)",
                 :strokeColor "rgba(151,187,205,1)",
                 :pointColor "rgba(151,187,205,1)",
                 :pointStrokeColor "#fff",
                 :data [28,48,40,19,96,27,100]
		}
              ]
   }
  )


(defn make-test-graph []
  (let [canvas-id (by-id "myChart")
        context-2d (.getContext canvas-id "2d")
        new-chart (.Line (.new Chart context-2d) data)
        ]
    (. js/console (log "hi"))
    (. js/console (log new-chart))
    )
  )

(set! (.-onload js/window) make-test-graph)

;var ctx = document.getElementById("myChart").getContext("2d");
;var myNewChart = new Chart(ctx).PolarArea(data)
                                        ;
