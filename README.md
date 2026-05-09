# 🛒 AutomationExercise E2E Test Suite

Automated end-to-end testing project for [automationexercise.com](https://automationexercise.com) built with **Selenium Java** using the **Page Object Model (POM)** design pattern.

---

## 📋 Test Scenario Overview

The test covers a full user journey from account creation to order placement and logout:

| Step | Action | Expected Result |
|------|--------|-----------------|
| 1 | Sign up with name and email | Redirected to signup info page |
| 2 | Fill in personal info, address, and date of birth | Account created successfully |
| 3 | Navigate to Products page and search for "T-shirt" | Search results displayed |
| 4 | Add the 1st search result to cart | Popup appears |
| 5 | Click "Continue Shopping" on popup | Popup closes |
| 6 | Add the 2nd search result to cart | Popup appears again |
| 7 | Click "Continue Shopping" on popup | Popup closes |
| 8 | Go to cart and delete one product | Product removed |
| 9 | Proceed to checkout and place order | Order confirmed |
| 10 | Download invoice and continue | Redirected to home page |
| 11 | Logout | Redirected to login page |

---

## 🗂️ Project Structure

```
src/
├── main/java/Pages/
│   ├── SignupPage.java         # Handles first step of signup (name + email)
│   ├── InfoPage.java           # Handles personal info, address, date of birth
│   ├── ProductsPage.java       # Handles search, add to cart, popup, checkout
│   ├── PaymentPage.java        # Handles entering payment details
│   └── DownloadLogoutPage.java # Handles invoice download and logout
├── /test/java
│     ├── BaseTest.java               # Sets up and tears down the browser driver
│     └── TestScenario.java           # The main test that runs the full scenario
```

---

## ⚙️ Technologies Used

- **Java** — Programming language
- **Selenium WebDriver** — Browser automation
- **TestNG** — Test framework (annotations, assertions)
- **Firefox** — Browser used for testing
- **Page Object Model (POM)** — Design pattern to keep page logic separate from test logic

---

## 🚀 How to Run

1. Make sure you have **Java**, **Maven**, and **Firefox** installed
2. Clone this repository
3. Run the test using your IDE (IntelliJ / Eclipse) or via terminal:

```bash
mvn test
```

---

## ✅ Assertions Verified

- After first signup step → URL is `https://automationexercise.com/signup`
- After account creation → URL is `https://automationexercise.com/account_created`
- After checkout → URL is `https://automationexercise.com/payment`
- After placing order → Page shows **"ORDER PLACED!"**
- After downloading invoice → URL is `https://automationexercise.com/`
- After logout → URL is `https://automationexercise.com/login`

---

## 📝 Notes

- The "Continue Shopping" popup on the products page has no fixed position on the screen. It is handled by locating the button using its text content and waiting for it to fully disappear before moving on.
- A JavaScript click is used on the popup button to avoid issues caused by the popup's fade animation.
- The second product requires a hover action before its "Add to cart" button becomes visible.
