var el;

function charCount(e){
    var textEnter, charDisplay, counter, lastkey;
    textEnter = document.getElementById('message').value;
    charDisplay = document.getElementById('charactersLeft');
    counter = (188 - (textEnter.length));
    charDisplay.textContent = counter;
    lastkey = document.getElementById('lastKey');
    lastkey.textContent = 'Last key in ASCII code: ' + e.keyCode;
}
el = document.getElementById('message');
el.addEventListener('keyup', charCount, false);