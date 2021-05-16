/*Name this external file gallery.js*/
var tmp;var x;
 window.addEventListener("load", function(){
      x=document.getElementById("image");
      tmp=x.innerHTML;
    });
 
 function upDate(previewPic){
 /* In this function you should 
    1) change the url for the background image of the div with the id = "image" 
    to the source file of the preview image     */
    x.innerHTML=previewPic.alt;
    x.style.backgroundImage="url("+previewPic.src+")";
//    x.style.background="previewPic.src";
//    previewPic.src
/*  2) Change the text  of the div with the id = "image" 
    to the alt text of the preview image 
    */
  
	}

	function unDo(){
     /* In this function you should 
    1) Update the url for the background image of the div with the id = "image" 
    back to the orginal-image.  You can use the css code to see what that original URL was      */
    x.style.backgroundImage="url('')";
    x.innerHTML=tmp;  
/*    2) Change the text  of the div with the id = "image" 
    back to the original text.  You can use the html code to see what that original text was
    */
		
	}