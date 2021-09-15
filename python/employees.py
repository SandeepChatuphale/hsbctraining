def addEmloyee(emp):
    for e in li:
        if e.get("empId") == emp.get("empId"):
            break;
    else:        
        li.append(emp);
    
def addEmloyees(li):
    for e in li:
        addEmloyee(e)


d1 = [{"empId":1,"empName":"Amit"},{"empId":10,"empName":"Anil"}];
d2 = [{"empId":2,"empName":"Sachin"}];
d3 = [{"empId":3,"empName":"Me"}];

li = [];

addEmloyees(d1);
addEmloyees(d2);
addEmloyees(d2);#NOt added
addEmloyees(d3);
addEmloyees(d3);#not added

    
print(li);


