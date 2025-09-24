$(document).ready(function(){
            $(".btn1").click(function(){
                $("#mydivid").addClass("changeClassName");
            })
            $(".btn2").click(function(){
                $("#mydivid").removeClass("changeClassName");
            })
            $(".btn3").click(function(){
                $("#mydivid").toggleClass("changeClassName");
            })
            $(".btn4").click(function(){
                $("#mydivid h1").text("Hiiii Jquery ..whatsapp");
                // change text using html while using tags 
                $("#mydivid p").html("<b>jQuery is a fast, small, and feature-rich JavaScript library.</b>Its primary purpose is to simplify client-side scripting of HTML, making tasks like HTML document traversal and manipulation, event handling, animation, and Ajax much easier to implement across various browsers");
            })

            $(".btnjq").click(function(){
                $(".div2 .jqans").html("<b>jQuery is a fast, small, and feature-rich JavaScript library</b>");
            })
            $(".btncss").click(function(){
                $(".div2 .cssans").html("<b>Cascading Style Sheets, is responsible for styling and layout, bringing your HTML to life with colors, fonts, and layouts.</b>");
            })
            $(".btnjs").click(function(){
                $(".div2 .jsans").html("<b>JavaScript (JS) is primarily used to add interactivity and dynamic behavior to websites.</b>");
            })
        })