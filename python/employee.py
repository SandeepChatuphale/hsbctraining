def addEmloyee(emp):
    for e in li:
        if e.get("empId") == emp.get("empId"):
            break;
    else:        
        li.append(emp);


d1 = {"empId":1,"empName":"Amit"};
d2 = {"empId":2,"empName":"Sachin"};
d3 = {"empId":3,"empName":"Me"};

li = [];

addEmloyee(d1);
addEmloyee(d2);
addEmloyee(d2);#NOt added
addEmloyee(d3);
addEmloyee(d3);#not added

    
print(li);


