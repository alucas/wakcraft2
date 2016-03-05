(ns alucas.wakcraft.core
  (:require
    [forge-clj.core :refer [defmod]]
    [alucas.wakcraft.common]
    [alucas.wakcraft.client]
    ))

(defmod wakcraft "0.0.1"
        :common {:pre-init alucas.wakcraft.common/common-pre-init}
        :client {:pre-init alucas.wakcraft.client/client-pre-init
                 :init     alucas.wakcraft.client/client-init})
