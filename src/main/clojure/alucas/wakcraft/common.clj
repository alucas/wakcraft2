(ns alucas.wakcraft.common
  (:require
    [alucas.wakcraft.blocks :refer [register-blocks]]))

(defn common-pre-init [this event]
  (register-blocks))
