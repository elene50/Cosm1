/*Регистрация*/
function reg()
{   {   
    var name = document.getElementById('surname').value;    
    var name = document.getElementById('name').value;    
    var phone = document.getElementById('phone').value;
    var login = document.getElementById('loginUser').value;
    var password = document.getElementById('passUser').value;
    if (!(/^.{3,20}$/.test(name))) {
            alert('Введите фамилию, не более 20 символов');
           return;
        }
     if (!(/^.{3,20}$/.test(name))) {
            alert('Введите имя, не более 20 символов');
           return;
        }
        if (!(/^.{3,20}$/.test(login))) {
            alert('Введите логин, не более 10 символов');
           return;
        }

        if (!(/^.{6,20}$/.test(password))) {
            return;
        } 
        if (!(/^.{3,12}$/.test(phone))) {
            alert('Введите телефон, не более 12 символов');
           return;
        }
}

/*Авторизация*/
function log()
{
    var login=document.getElementById('loginUser').value;
    var password=document.getElementById('passUser').value;
    
    if (!(/^.{1,20}$/.test(login))) {
        alert ('Введите логин');
        return;
    }

    if (!(/^.{1,20}$/.test(password))) {
        alert ('Введите пароль');
        return;
    }
}

function name()
{
    var name=document.getElementById('name').value;
    
    if (!(/^.{1,20}$/.test(name))) {
        alert ('Введите ФИО');
        return;
    }
}
}
