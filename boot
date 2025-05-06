<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Ejercicios Bootstrap Grid</title>
  <!-- Enlace a Bootstrap CSS -->
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

    <!-- Ejercicio 1 -->
    <h3>Ejercicio 1: Todas en una sola fila (tamaño igual)</h3>
    <div class="row">
      <div class="col box red"></div>
      <div class="col box orange"></div>
      <div class="col box yellow"></div>
      <div class="col box green"></div>
      <div class="col box lightblue"></div>
      <div class="col box blue"></div>
      <div class="col box purple"></div>
    </div>

    <!-- Ejercicio 2 -->
    <h3 class="mt-5">Ejercicio 2: 3 arriba, 4 abajo (tamaño igual)</h3>
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

    <!-- Ejercicio 3 -->
    <h3 class="mt-5">Ejercicio 3: Fila con tamaños diferentes (3 + 2 + 1 + ...)</h3>
    <div class="row">
      <div class="col-3 box red"></div>       <!-- ocupa 3 espacios -->
      <div class="col-2 box orange"></div>    <!-- ocupa 2 espacios -->
      <div class="col-1 box yellow"></div>    <!-- ocupa 1 espacio -->
      <div class="col-1 box green"></div>
      <div class="col-1 box lightblue"></div>
      <div class="col-2 box blue"></div>
      <div class="col-2 box purple"></div>
    </div>

    <!-- Ejercicio 4 -->
    <h3 class="mt-5">Ejercicio 4: Mitad + reparto entre el resto</h3>
    <div class="row">
      <div class="col-6 box red"></div>       <!-- mitad de la fila -->
      <div class="col-2 box orange"></div>
      <div class="col-2 box yellow"></div>
      <div class="col-2 box green"></div>
    </div>
    <div class="row">
      <div class="col-6 box lightblue"></div> <!-- mitad de la fila -->
      <div class="col-3 box blue"></div>
      <div class="col-3 box purple"></div>
    </div>

    <!-- Ejercicio 5 -->
    <h3 class="mt-5">Ejercicio 5: Responsive (fila si grande, 2 filas si pequeño)</h3>
    <div class="row">
      <!-- col-12: ocupa toda la fila en pantallas pequeñas
           col-md: usa columnas iguales en pantallas medianas o grandes -->
      <div class="col-12 col-md box red"></div>
      <div class="col-12 col-md box orange"></div>
      <div class="col-12 col-md box yellow"></div>
      <div class="col-12 col-md box green"></div>
      <div class="col-12 col-md box lightblue"></div>
      <div class="col-12 col-md box blue"></div>
      <div class="col-12 col-md box purple"></div>
    </div>

  </div>

  <!-- Bootstrap JS (opcional, solo necesario si usas componentes interactivos) -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
