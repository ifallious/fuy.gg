package com.busted_moments.client.framework.render.helpers

import com.mojang.blaze3d.platform.Window
import com.mojang.blaze3d.vertex.PoseStack
import net.minecraft.client.DeltaTracker
import net.minecraft.client.gui.GuiGraphics
import net.minecraft.client.gui.render.GuiRenderer
import net.minecraft.client.gui.render.state.GuiRenderState
import net.minecraft.client.renderer.MultiBufferSource
import org.joml.Matrix3x2fStack

typealias IContext = Context

interface Context {
    val graphics: GuiGraphics
    val matrixStack: Matrix3x2fStack
    val guiRenderState: GuiRenderState
    val deltaTracker: DeltaTracker
    val window: Window
}
