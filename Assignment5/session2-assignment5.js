$(document).ready(init);

function init() {
    $('#blurEffect').on('click', function( e ) {
            Custombox.open({
                target: '#modal',
                effect: 'blur',
                escKey: 'true'
            });
            e.preventDefault();
        });
    
    $('#signEffect').on('click', function( e ) {
            Custombox.open({
                target: '#modal',
                effect: 'sign',
                escKey: 'true'
            });
            e.preventDefault();
        });
    
    $('#doorEffect').on('click', function( e ) {
            Custombox.open({
                target: '#modal',
                effect: 'door',
                escKey: 'true',
                speed: 3000
            });
            e.preventDefault();
        });
    
    $('#makewayEffect').on('click', function( e ) {
            Custombox.open({
                target: '#modal',
                effect: 'makeway',
                escKey: 'true',
                overlayColor: '#33fad2'
            });
            e.preventDefault();
        });
    
    $('#contentscaleEffect').on('click', function( e ) {
            Custombox.open({
                target: '#modal',
                effect: 'contentscale',
                escKey: 'true'
            });
            e.preventDefault();
        });
    
    $('#slipEffect').on('click', function( e ) {
            Custombox.open({
                target: '#modal',
                effect: 'slip',
                escKey: 'true',
                speed: 3000
            });
            e.preventDefault();
        });
    
    $('#slidetogetherEffect').on('click', function( e ) {
            Custombox.open({
                target: '#modal',
                effect: 'slidetogether',
                escKey: 'true',
                overlayOpacity: 0.75
            });
            e.preventDefault();
        });
    
    $('#letmeinEffect').on('click', function( e ) {
            Custombox.open({
                target: '#modal',
                effect: 'letmein',
                escKey: 'true',
                position: ['center','bottom']
            });
            e.preventDefault();
        });
    
    $('#sidefallEffect').on('click', function( e ) {
            Custombox.open({
                target: '#modal',
                effect: 'sidefall',
                escKey: 'true',
                position:['center','center']
            });
            e.preventDefault();
        });
    
    $('#newspaperEffect').on('click', function( e ) {
            Custombox.open({
                target: '#modal',
                effect: 'newspaper',
                escKey: 'true',
                overlayEffect: 'push'
            });
            e.preventDefault();
        });
}