function add() {
    var el = document.getElementById('jv1');
    if(this.value.length < 5){
        el.textContent = 'Tên đăng nhập tối thiểu 5 ký tự';
    } else {
        el.textContent = '';
    }
}
var el = document.getElementById('name1');
el.onblur = add;

function add1() {
    var el = document.getElementById('jv2');
    if(this.value.length < 5){
        el.textContent = 'Mật khẩu tối thiểu 5 ký tự';
    } else {
        el.textContent = '';
    }
}
var el1 = document.getElementById('name2');
el1.onblur = add1;

function add2() {
    var el = document.getElementById('jv3');
    if(this.value.length < 5){
        el.textContent = 'Mật khẩu tối thiểu 5 ký tự';
    } else {
        el.textContent = '';
    }
}
var el2 = document.getElementById('name3');
el2.onblur = add2;

function checkEmail() {
    var elMsg = document.getElementById('jv4');
    var name4 = document.getElementById('name4');
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (!filter.test(name4.value)) {
        elMsg.textContent = 'Email không đúng định dạng';
    }
    else{
        elMsg.textContent = 'Email hợp lệ';
    }
}
elMsg.addEventListener('submit', checkEmail, false)