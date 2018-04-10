<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Ler</title>
        <link href="../starter-template.css" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark bg-primary fixed-top">
            <a class="navbar-brand" href="../index.jsp">SISTEMA DE CONTATOS</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="../index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="gravar.jsp">Gravar</a>
                    </li>
                    <li class="nav-item" active>
                        <a class="nav-link" href="ler.jsp">Ler<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="editar.jsp">Editar</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="apagar.jsp">Apagar</a>
                    </li>
                </ul>
            </div>
        </nav>

    <main role="main" class="container">
        <div class="starter-template">
            <h1>Ler Contato</h1>
            <form action="../FrontController?action=LerContato" method="POST">
                <div class="input-group mb-2 col-md-6 offset-md-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="inputGroup-sizing-default">ID</span>
                    </div>
                    <input type="text" name="textId" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default">
                </div>
                <input class="btn btn-primary" type="submit"/>
            </form>
            <br><br>
            <table class="table table-dark">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Nome</th>
                        <th scope="col">Email</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row"><%= request.getParameter("id")%></th>
                        <td><%= request.getParameter("nome")%></td>
                        <td><%= request.getParameter("email")%></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </main>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <script type="text/javascript">
    </script>
</body>
</html>
