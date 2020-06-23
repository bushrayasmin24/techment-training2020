// Tabbed Menu
function openMenu(evt, menuName) {
    var i, x, tablinks;
    x = document.getElementsByClassName("menu");
    for (i = 0; i < x.length; i++) {
      x[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablink");
    for (i = 0; i < x.length; i++) {
      tablinks[i].className = tablinks[i].className.replace(" w3-dark-grey", "");
    }
    document.getElementById(menuName).style.display = "block";
    evt.currentTarget.firstElementChild.className += " w3-dark-grey";
  }
  //document.getElementById("myLink").click();
//contact us
  // const url = 'http://localhost:3000/contact'
  // contact.onclick = function (e) {
  //   //debugger ;
  //   e.preventDefault();
  //   addMsg();
  // };

  function addMsg() {

    let name = username.value;
    let noofpeople = noofpeople.value;
    let date = dateofmsg.value;
    let msg = msg.value;

    axios.post(url, {
      id,
      name,
      address,
      street,
      pincode,
      state
    })
      .then(function () { alert("Record Inserted!") }).catch(function (er) { alert("Error!"); console.error(er) });
  }
  function openForm() {
    document.getElementById("myForm").style.display = "block";
  }
  
  function closeForm() {
    document.getElementById("myForm").style.display = "none";
  }
  
  // Tabbed Menu
  function openMenu(evt, menuName) {
      var i, x, tablinks;
      x = document.getElementsByClassName("menu");
      for (i = 0; i < x.length; i++) {
        x[i].style.display = "none";
      }
      tablinks = document.getElementsByClassName("tablink");
      for (i = 0; i < x.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" w3-dark-grey", "");
      }
      document.getElementById(menuName).style.display = "block";
      evt.currentTarget.firstElementChild.className += " w3-dark-grey";
    }
    document.getElementById("myLink").click();