<%@page language = "java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Two Numbers</title>
    <style>
        body {
            background: #f4f7fa;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: #fff;
            padding: 32px 40px;
            border-radius: 12px;
            box-shadow: 0 4px 24px rgba(0,0,0,0.08);
            min-width: 320px;
        }
        h2 {
            margin-top: 0;
            color: #2d3a4b;
            text-align: center;
        }
        p{
            color: #4b5d6b;
            text-align: center;
            margin-bottom: 24px;
        }
        form {
            display: flex;
            flex-direction: column;
            gap: 16px;
        }
        label {
            color: #4b5d6b;
            margin-bottom: 4px;
        }
        input[type="number"] {
            padding: 8px 12px;
            border: 1px solid #cfd8dc;
            border-radius: 6px;
            font-size: 1rem;
            transition: border 0.2s;
        }
        input[type="number"]:focus {
            border-color: #1976d2;
            outline: none;
        }
        button {
            background: #1976d2;
            color: #fff;
            border: none;
            padding: 10px 0;
            border-radius: 6px;
            font-size: 1rem;
            cursor: pointer;
            transition: background 0.2s;
        }
        button:hover {
            background: #1565c0;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Add Alien</h2>
        <form action="addAlien" method="post">
            <label for="alienname">Enter Your Name:</label>
            <input text="number" id="alienname" name="alienname" required>
            <label for="alienid">Enter Yiour ID:</label>
            <input type="number" id="alienid" name="alienid" required>
            <button type="submit">Add Numbers</button>
        </form>
    </div>
</body>
</html>