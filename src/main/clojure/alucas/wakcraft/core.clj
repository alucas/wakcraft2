(ns alucas.wakcraft.core
  (:require
    [forge-clj.core :refer [defmod]]
    [alucas.wakcraft.common]
    ))

(defmod wakcraft "0.0.1"
        :common {:init alucas.wakcraft.common/common-init})
