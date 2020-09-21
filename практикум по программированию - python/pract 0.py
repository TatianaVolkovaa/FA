
from tkinter import *
from math import sin, cos, radians
 
root = Tk()
c = Canvas(root, width=600, height=600, bg="white")
c.pack()
 
ball = c.create_oval(100, 100, 500, 500, fill='lightgrey', outline='black', width=2)
point = c.create_oval(290, 90, 310, 110, fill = 'green')  

a = 0
def motion():
    # a - угол
    global a
    a += 0.9
    # x, y - координаты центра двигающейся точки
    # 300 - цетр окружности, 200 - радиус окружности
    x = 300 + 200 * cos(radians(a)) 
    y = 300 + 200 * sin(radians(a))
    # r радиус точки
    r = 10
    x1 = x - r   
    y1 = y - r
    x2 = x + r
    y2 = y + r
    # перемещение точки
    c.coords(point, x1, y1, x2, y2) 
    root.after(16, motion)
    
motion()
 
root.mainloop()