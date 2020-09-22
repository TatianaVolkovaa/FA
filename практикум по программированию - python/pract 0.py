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
    # direction - направление движения, если равно 1 - по часовой стрелке, -1 - против часовой
    direction = 1   
    a += direction * 0.9
    # x, y - координаты центра двигающейся точки
    # 300 - цетр окружности, 200 - радиус окружности
    x = 300 + 200 * cos(radians(a)) 
    y = 300 + 200 * sin(radians(a))
    # 10 - радиус точки
    x1 = x - 10   
    y1 = y - 10
    x2 = x + 10
    y2 = y + 10
    # перемещение точки
    c.coords(point, x1, y1, x2, y2) 
    # speed - скорость движения
    speed = 20
    root.after(speed, motion)
    
motion()
 
root.mainloop()
