// app.js
function checkCredentials() {
  let username = document.getElementById('username').value;
  let password = document.getElementById('password').value;

  // For testing purposes, you can set a hardcoded username and password
  const correctUsername = 'testuser';
  const correctPassword = 'testpassword';

  if (username === correctUsername && password === correctPassword) {
    // Store the login status in local storage
    localStorage.setItem('isLoggedIn', 'true');

    alert('Login successful!');
    // Redirect or perform other actions upon successful login
  } else {
    alert('Invalid username or password. Please try again.');
  }
}
