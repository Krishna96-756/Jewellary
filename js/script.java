
  $(document).ready(function(){
    $(".menulist").click(function(){
      $(this).children('.nav-link').next(".submenu").toggle();
    });
    });