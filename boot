<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Ejercicios Bootstrap Grid</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    .box {
      min-width: 100px;
      min-height: 100px;
      border-radius: 10px;
      border: 2px solid black;
      margin: 5px;
    }
    .red { background-color: red; }
    .orange { background-color: orange; }
    .yellow { background-color: yellow; }
    .green { background-color: green; }
    .lightblue { background-color: lightblue; }
    .blue { background-color: blue; }
    .purple { background-color: purple; }
  </style>
</head>
<body>

  <div class="container my-4">

    <h3>Ejercicio 1</h3>
    <div class="row">
      <div class="col box red"></div>
      <div class="col box orange"></div>
      <div class="col box yellow"></div>
      <div class="col box green"></div>
      <div class="col box lightblue"></div>
      <div class="col box blue"></div>
      <div class="col box purple"></div>
    </div>

    <h3 class="mt-5">Ejercicio 2</h3>
    <div class="row">
      <div class="col box red"></div>
      <div class="col box orange"></div>
      <div class="col box yellow"></div>
    </div>
    <div class="row">
      <div class="col box green"></div>
      <div class="col box lightblue"></div>
      <div class="col box blue"></div>
      <div class="col box purple"></div>
    </div>

    <h3 class="mt-5">Ejercicio 3</h3>
    <div class="row">
      <div class="col-3 box red"></div>
      <div class="col-2 box orange"></div>
      <div class="col-1 box yellow"></div>
      <div class="col-1 box green"></div>
      <div class="col-1 box lightblue"></div>
      <div class="col-2 box blue"></div>
      <div class="col-2 box purple"></div>
    </div>

    <h3 class="mt-5">Ejercicio 4</h3>
    <div class="row">
      <div class="col-6 box red"></div>
      <div class="col-2 box orange"></div>
      <div class="col-2 box yellow"></div>
      <div class="col-2 box green"></div>
    </div>
    <div class="row">
      <div class="col-6 box lightblue"></div>
      <div class="col-3 box blue"></div>
      <div class="col-3 box purple"></div>
    </div>

    <h3 class="mt-5">Ejercicio 5</h3>
    <div class="row">
      <div class="col-12 col-md box red"></div>
      <div class="col-12 col-md box orange"></div>
      <div class="col-12 col-md box yellow"></div>
      <div class="col-12 col-md box green"></div>
      <div class="col-12 col-md box lightblue"></div>
      <div class="col-12 col-md box blue"></div>
      <div class="col-12 col-md box purple"></div>
    </div>

  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
