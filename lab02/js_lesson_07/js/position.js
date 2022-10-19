$(function () {
    var $window = $(window);
    var $slidead = $('#slideAd');
    var endZone = $('#footer').offset().top - $window.height() - 500;

    $window.on('scroll', function () {
        if(endZone < $window.scrollTop()) {
            $slidead.animate({'right': '0px'}, 250);
        } else {
            $slidead.stop(true).animate({'right' : '-360px'}, 250);
        }
    });
});