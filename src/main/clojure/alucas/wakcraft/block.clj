(ns alucas.wakcraft.block
  (:require
    [forge-clj.blocks :refer [defblock]])
  (:import
    [net.minecraft.block Block]
    [net.minecraft.creativetab CreativeTabs]))

(defblock test-block
  :unlocalized-name "wakcraft.Box"
  :hardness 0.5
  :step-sound Block/soundTypeStone
  :creative-tab CreativeTabs/tabBlock
  ;:block-texture-name "wakcraft:grass"
  )
