Set oShell = CreateObject("Wscript.Shell")
Dim strArgs
strArgs = "cmd /c Bona-Fide.bat"
oShell.Run strArgs, 0, false 