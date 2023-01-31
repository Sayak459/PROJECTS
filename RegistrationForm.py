import csv
from tkinter import *
import os
from tkinter.messagebox import showinfo
class Student_Registration(Tk):
    def __init__(self):
        super().__init__()
        self.title("Student Registration")
        self.geometry("450x700")
        self.m=Menu(self)
        self.m1=Menu(self.m,tearoff=0)
        self.m1.add_command(label="About", command= self.Help)
        self.m.add_cascade(label="About",menu=self.m1)
        self.config(menu=self.m)
        self.c1=Canvas(self,bg="Orange",width=450,height=20)
        self.c1.place(x=0,y=0)
        self.c1.create_text(50,10,text=".  Student Details",fill="white",font=("Comic"))
        self.l1=Label(self,text="First Name").place(x=0,y=30)
        self.e1=Entry(self)
        self.e1.place(x=80,y=30)
        self.l2=Label(self,text="Middle Name").place(x=0,y=60)
        self.e2=Entry(self)
        self.e2.place(x=80,y=60)
        self.l3=Label(self,text="Last Name").place(x=0,y=90)
        self.e3=Entry(self)
        self.e3.place(x=80,y=90)
        self.l4=Label(self,text="Date of Birth").place(x=220,y=30)
        self.e4=Entry(self)
        self.e4.place(x=300,y=30)
        self.l5=Label(self,text="Mobile No.").place(x=220,y=60)
        self.e5=Entry(self)
        self.e5.place(x=300,y=60)
        self.l6=Label(self,text="Email ID").place(x=220,y=90)
        self.e6=Entry(self)
        self.e6.place(x=300,y=90)
        self.l7=Label(self,text="Religion").place(x=0,y=120)
        x=["Hindu","Muslim","Christian","Buddhist","Jainist"]
        self.n1=StringVar()
        self.n1.set("Select")
        self.n2=OptionMenu(self,self.n1,*x)
        self.n2.place(x=80,y=115)
        self.l8=Label(self,text="Gender").place(x=0,y=150)
        self.var=StringVar()
        self.r1=Radiobutton(self,text="Male",variable=self.var,value="Male")
        self.r1.place(x=80,y=150)
        self.r2=Radiobutton(self,text="Female",variable=self.var,value="Female")
        self.r2.place(x=180,y=150)
        self.r3=Radiobutton(self,text="Others",variable=self.var,value="Others")
        self.r3.place(x=280,y=150)
        self.l9=Label(self,text="Address :- ").place(x=0,y=210)
        self.e9=Entry(self)
        self.e9.place(x=80,y=210)
        self.c3=Canvas(self,bg="Brown",width=450,height=20)
        self.c3.place(x=0,y=330)
        self.c3.create_text(50,10,text=".   Parent's Details",fill="white",font=("Comic"))
        self.l17=Label(self,text="1. Father's Details: ").place(x=0,y=360)
        self.l18=Label(self,text="Father's Name").place(x=0,y=390)
        self.e18=Entry(self)
        self.e18.place(x=90,y=390)
        self.l19=Label(self,text="Occupation").place(x=220,y=390)
        x1=["Business","Service","Self-Occupied","Others"]
        self.n3=StringVar()
        self.n3.set("Select")
        self.n4=OptionMenu(self,self.n3,*x1)
        self.n4.place(x=300,y=385)
        self.l20=Label(self,text="Mobile No.").place(x=0,y=420)
        self.e20=Entry(self)
        self.e20.place(x=90,y=420)
        self.l21=Label(self,text="Email ID").place(x=220,y=420)
        self.e21=Entry(self)
        self.e21.place(x=300,y=420)
        self.l22=Label(self,text="2. Mother's Details: ").place(x=0,y=450)
        self.l23=Label(self,text="Mother's Name").place(x=0,y=480)
        self.e23=Entry(self)
        self.e23.place(x=90,y=480)
        self.l24=Label(self,text="Occupation").place(x=220,y=480)
        x2=["Business","Service","Self-Occupied","House Wife","Others"]
        self.n5=StringVar()
        self.n5.set("Select")
        self.n6=OptionMenu(self,self.n5,*x2)
        self.n6.place(x=300,y=475)
        self.l25=Label(self,text="Mobile No.").place(x=0,y=510)
        self.e25=Entry(self)
        self.e25.place(x=90,y=510)
        self.l26=Label(self,text="Email ID").place(x=220,y=510)
        self.e26=Entry(self)
        self.e26.place(x=300,y=510)
        self.b=Button(self,text="Submit",bg="Blue",fg="White",width=20)
        self.b["command"]=self.operation
        self.b.place(x=300,y=660)
        self.b1=Button(self,text="View",bg="Blue",fg="White",width=20)
        self.b1["command"]=self.view
        self.b1.place(x=0,y=660)
    def Help(self):
        s=Help()
        self.destroy()
    def view(self):
        view = os.startfile("C:\\Users\\Student\\Desktop\\New folder\\student_details.csv")
    def operation(self):
        l=[]
        fn=(self.e1.get())
        l.append(fn)
        mn=(self.e2.get())
        l.append(mn)
        ln=(self.e3.get())
        l.append(ln)
        db=(self.e4.get())
        l.append(str(db))
        m=(self.e5.get())
        if(len(m)!=10):
            showinfo(title="popup",message="Student Phone No. invalid")
        else:
            l.append(str(m))
        e=(self.e6.get())
        l.append(e)
        r=(self.n1.get())
        l.append(r)
        g=(self.var.get())
        l.append(g)
        a=(self.e9.get())
        l.append(a)
        fan=(self.e18.get())
        l.append(fan)
        fo=(self.n3.get())
        l.append(fo)
        fm=(self.e20.get())
        if(len(fm)!=10):
            showinfo(Title="popup",message="Father's Phone No. invalid")
        else:
            l.append(str(fm))
        fe=(self.e21.get())
        l.append(fe)
        mon=(self.e23.get())
        l.append(mon)
        mo=(self.n5.get())
        l.append(mo)
        mm=(self.e25.get())
        if(len(mm)!=10):
            showinfo(Title="popup",message="Mother's Phone No. invalid")
        else:
            l.append(str(mm))
        me=(self.e26.get())
        l.append(me)
        self.e1.delete(0,END)
        self.e2.delete(0,END)
        self.e3.delete(0,END)
        self.e4.delete(0,END)
        self.e5.delete(0,END)
        self.e6.delete(0,END)
        self.e9.delete(0,END)
        self.e18.delete(0,END)
        self.e20.delete(0,END)
        self.e21.delete(0,END)
        self.e23.delete(0,END)
        self.e25.delete(0,END)
        self.e26.delete(0,END)
        x=random.randint(1,100)
        rno=fn[:3]+ln[-3:]+str(x)
        l1=[]
        l1.append(rno)
        l1.extend(l)
        with open("student_details.csv","a+") as f:
            x=csv.writer(f)
            x.writerow(l1)
if(__name__=="__main__"):
    s=Student_Registration()
    s.mainloop()

