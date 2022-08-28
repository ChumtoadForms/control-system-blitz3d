Graphics3D 800, 600
SetBuffer BackBuffer()
AppTitle "Control System On Blitz3D"

player = CreateCamera() ; player

;Timers
timer_walk = 0
timer_walk2 = 0

While Not KeyHit(0)

;Control System

If KeyDown(17) ; W

	MoveEntity player, 0, 0, 0.01

EndIf

If KeyDown(31) ; S

	MoveEntity player, 0, 0, -0.01

EndIf

If KeyDown(30) TurnEntity player, 0, 0.80, 0 ; A
If KeyDown(32) TurnEntity player, 0, -0.80, 0 ; D


;Sprint
If KeyDown(17) And KeyDown(42) ; Shift + W

	MoveEntity player, 0, 0, 0.02 

EndIf



RenderWorld
UpdateWorld
Flip
Wend
End
