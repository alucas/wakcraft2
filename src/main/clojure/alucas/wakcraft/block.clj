(ns alucas.wakcraft.block
  (:require
    [forge-clj.blocks :refer [defblock]])
  (:import
    [net.minecraft.block Block]
    [net.minecraft.creativetab CreativeTabs]))

(defblock test-block
  :block-name "test-block"
  :hardness 0.5
  :step-sound Block/soundTypeStone
  :creative-tab CreativeTabs/tabBlock
  :block-texture-name "wakcraft:grass")
