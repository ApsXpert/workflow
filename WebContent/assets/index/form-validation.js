/* --- JavaScript --- */
$('form').validate();

$('#password, #passwordConfirm').on('keyup', function() {
  if ($('#password').val() == $('#passwordConfirm').val()) {
    $('#message').html('Matching').css('color', 'green');
    $('#submit').prop('disabled', false);
  } else {
    $('#message').html('Not Matching').css('color', 'red');
    $('#submit').prop('disabled', true);
  }
});