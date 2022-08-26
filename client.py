from cProfile import run
from itertools import count
import PySimpleGUI as sg
from tkinter import *
from tkinter import messagebox

root = Tk() 
running = True

def main():


   
    root.title("Download Music")
    root.geometry("300x200")

    global e1

    Label(root, text = "File Path").place(x=10, y=10) 


    e1 = Entry(root) 
    e1.place(x=130, y=10) 

    Button(root, text="Start!", command=start, height= 3, width=13).place(x=10, y=40) 

    root.mainloop()
    
def start():
    #path_to_use = e1.get()
    path_to_use = "/Users/vatsalchandel/Desktop/Projects/ClassOpener/Links.txt"
    file = open(path_to_use, 'r')
    lines = file.readlines()
    for line in lines:
        tots = line.split(',')
        link = tots[0]
        time = tots[1]
        
        print(link, time)









if __name__ == "__main__":
    main()