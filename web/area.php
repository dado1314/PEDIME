<?php
    if(isset($_POST['area']) && !empty($_POST['area'])){
        $areaRegistrada = $_POST['area'];
        
        $db = "Menu_Electronico";
        $host = "jdbc:mysql://localhost:3306/menu_electronico";
        $pw = "rootpass";
        $user = "root";
        
        $con = mysql_connect($host,$user,$pw) or die ("No se pudo autentificar Workbench.");
        mysql_select_db($db,$con) or die ("No se pudo conectar la base.");
        mysql_query("INSERT INTO AreaOperativa(idArea,Area) values (1,'$area')");
        echo "Guardado correctamente <br>";
        echo "<a href='area.html'> Volver</a>";
    }
    else
    {
        echo "Llenar todos los campos";
    }
?>