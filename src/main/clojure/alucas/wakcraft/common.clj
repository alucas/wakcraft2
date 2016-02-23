(ns alucas.wakcraft.common
  (:require
    [forge-clj.registry :refer [register]]
    [alucas.wakcraft.block :refer [test-block]]))

(defn common-init [this event]
  (register test-block "wackcraft.test-block"))
