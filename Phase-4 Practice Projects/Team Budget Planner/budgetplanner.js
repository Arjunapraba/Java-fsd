class Project{
    constructor(pId, client_project, project_manager, project_cost){
        this.pId = pId;
        this.client_project = client_project;
        this.project_manager = project_manager;
        this.project_cost = project_cost;
    }
}
var currentPId =0;
var myData = null;

function initialize(){
    if (localStorage.getItem("myData") ===null){
        //alert("inside if")
        myData = [ new Project(0,"Disney EPCOT Project","Vincent",25000),
        new Project(1,"IBM Big Blue Project","Nate",32000),
        new Project(2,"Alphabet Calico Project","Erika",78000),
        ]
        currentPId = myData.length;
        localStorage.setItem("myData", JSON.stringify(myData));
    }else{
        myData = JSON.parse(localStorage.getItem("myData"));
        currentPId = myData.length;
    }
}

function TableCreation() {    
    initialize();
    $('tbody').empty()

    var myDataTest = JSON.parse(localStorage.getItem("myData"))

    $.each(myDataTest, function (key, value) {
        $('tbody').append(`<tr>
    <td>${value.pId}</td>
    <td>${value.client_project}</td>
    <td>${value.project_manager}</td>
    <td>${value.project_cost}</td>
    <td><button class="btn btn-primary" onclick="DeleteOperation(${value.pId})">Delete</button></td>
  </tr>`);
    })
}


function AddProject() {
    var clientProjectName = document.getElementById("clientProjectInput").value;
    var projectManager = document.getElementById("projectManagerInput").value;
    var projectCost = document.getElementById("projectCostInput").value;


    document.getElementById("clientProjectInput").value = "";
    document.getElementById("projectManagerInput").value = "";
    document.getElementById("projectCostInput").value = "";


    InsertOperation(currentpId, clientProjectName, projectManager, projectCost);
    

}

function InsertOperation(pId, clientProjectName, projectManager, projectCost) {
    var a= new Project(pId, clientProjectName, projectManager, projectCost);
    myData.push(a);
    currentPId++;
    localStorage.clear();
    localStorage.setItem("myData", JSON.stringify(myData))
   
    TableCreation();

}

function DeleteOperation(pId) {
     
    for( var i = 0; i < myData.length; i++){ 
    
        if (parseInt(myData[i].pId) === parseInt(pId)) { 
            if(confirm("Confirm deletion" + JSON.stringify(myData[i]))){
                myData.splice(i,1);
                localStorage.removeItem("myData");
                localStorage.setItem("myData", JSON.stringify(myData))
            }else{
                break;
            }
    
         
        }
    
    }
    TableCreation();
}