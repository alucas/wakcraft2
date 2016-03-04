(ns alucas.wakcraft.common
  (:require
    [forge-clj.registry :refer [register]]
    [alucas.wakcraft.blocks :refer [register-blocks]]))

(defn common-init [this event]
  (register-blocks))
