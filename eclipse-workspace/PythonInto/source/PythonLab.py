from Tkinter import Tk, Canvas, Frame, Button
from Tkinter import BOTH, CENTER, N, S, SW, SE, W, NW, SUNKEN, TOP, X, FLAT, LEFT
import time
top = Tk()

c = Canvas(top,bg="green", height=250, width=300)
c.create_oval(75, 50, 175, 150, fill="green")
c.create_oval(100, 75,125, 100, fill="green")
c.create_oval(150, 75, 125, 100, fill="green")
c.create_rectangle(100, 115, 150, 120, fill="green")
c.pack()

def eyes():
    c.create_oval(75, 50, 175, 150, fill="green")
    c.create_oval(100, 75,125, 100, fill="green")
    c.create_oval(150, 55, 125, 80, fill="green")
    c.create_rectangle(100, 115, 150, 120, fill="green")
    c.pack()


                        
def talk():
    c.create_oval(75, 50, 175, 150, fill="green")
    c.create_oval(100, 75,125, 100, fill="green")
    c.create_oval(150, 75, 125, 100, fill="green")
    c.create_rectangle(100, 115, 150, 130, fill="green")
    c.pack()

def reset():
    c.create_oval(75, 50, 175, 150, fill="green")
    c.create_oval(100, 75,125, 100, fill="green")
    c.create_oval(150, 75, 125, 100, fill="green")
    c.create_rectangle(100, 115, 150, 120, fill="green")
    c.pack()

quit = Button(c, text = "Quit", command = quit, anchor = N)
quit.configure(width = 5, activebackground = "#33B5E5",relief = FLAT)
quit_window = c.create_window(125, 25, anchor=CENTER, window=quit)

eyes = Button(c, text = "Eyes", command = eyes, anchor = N)
eyes.configure(width = 5, activebackground = "#33B5E5",relief = FLAT)
eyes_window = c.create_window(83, 200, anchor=CENTER, window=eyes)

talk = Button(c, text = "Talk", command = talk, anchor = N)
talk.configure(width = 5, activebackground = "#33B5E5",relief = FLAT)
talk_window = c.create_window(166, 200, anchor=CENTER, window=talk)

reset = Button(c, text = "Reset", command = reset, anchor = N)
reset.configure(width = 5, activebackground = "#33B5E5",relief = FLAT)
reset_window = c.create_window(125, 230, anchor=CENTER, window=reset)
top.mainloop()