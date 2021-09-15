#[] - list
#() - tuple
#{"":""} - Dict
#{} - set


def addEmloyee(emp):
    for e in li:
        if e.get("empId") == emp.get("empId"):
            break;
    else:        
        li.append(emp);


def addEmloyees(li):
    for e in li:
        addEmloyee(e)





def getAllUniqueDepts(emp):
    setdept = {''};
    for e in li:
        setdept.add(e.get('dept'));
    return setdept;

def groupEmployeesByDept(emp,setdept):
    li = [];
    for e in emp:
        emp.get('de')



d1 = [{"empId":1,"empName":"Amit","dept":"HR"},{"empId":10,"empName":"Anil","dept":"IT"}];
d2 = [{"empId":2,"empName":"Sachin","dept":"Accounts"}];
d3 = [{"empId":3,"empName":"Me","dept":"IT"}];

li = [];

addEmloyees(d1);
addEmloyees(d2);
addEmloyees(d2);#NOt added
addEmloyees(d3);
addEmloyees(d3);#not added

print(getAllUniqueDepts(li));

groupEmployeesByDept(li,getAllUniqueDepts(li));

#print(li);



