$(function() {
    $('#showSearch').submit(serCall);
});

function serCall(event) {
    event.preventDefault();
    var f = $(this);
    var show = f.find('[name=showTitle]').val();
    $.ajax({
        url:'/show',
        type: 'GET',
        contentType: 'application/json',
        data: JSON.stringify({
            'show': show
        }),
        success: function(data) {
            console.log(data);
            displayData(data);
        }
    });
}

function displayData(data) {
    var container = document.getElementById('myContainer');
    console.log(data);
}
