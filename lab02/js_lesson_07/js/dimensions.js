$(function () {
    var listHeight = $('#page').height();

    $('ul').append('<p>Heighr: ' + listHeight + 'px</p>');
    $('li').width('50%');
    $('li#one').width(125);
    $('li#two').width('75%');
});