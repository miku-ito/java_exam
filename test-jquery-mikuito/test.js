// q1
console.log('伊藤美空');

//q2
$('#q2_btn').on('click', function() {
    $('#q2_name').css('color', 'red');
});

// q3
$('#q3_btn').on('click', function() {
    let age = $('#q3_age').val();
    alert(age);
})

// q4
$('#q4_btn').on('click', function() {
    $('#q4_btn').prop('disabled', 'true');
})

// q5
$('#q5_java').hide();
$('#q5_js').hide();
$("#q5_select").on("change", function() {
    if ($('#q5_select').val() === '1') {
        $('#q5_java').show();    
        $('#q5_js').hide();
    } else if (($('#q5_select').val() === '2')) {
        $('#q5_js').show();
        $('#q5_java').hide();
    } else {
        $('#q5_java').hide();
        $('#q5_js').hide();
    }
});
