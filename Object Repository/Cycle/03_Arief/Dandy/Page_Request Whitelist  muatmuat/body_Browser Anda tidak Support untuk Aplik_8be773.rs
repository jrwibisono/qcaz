<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Browser Anda tidak Support untuk Aplik_8be773</name>
   <tag></tag>
   <elementGuidId>0ea550e3-c530-4f4b-9c77-844411c97647</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>25f2f4c4-e645-47d8-829d-60bb3d55e0ce</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-aos-easing</name>
      <type>Main</type>
      <value>ease-in-out</value>
      <webElementGuid>41d9dec0-3803-452e-9980-14ece26e155d</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-aos-duration</name>
      <type>Main</type>
      <value>800</value>
      <webElementGuid>9340603a-f073-4288-bde3-3ee0305f7647</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-aos-delay</name>
      <type>Main</type>
      <value>0</value>
      <webElementGuid>81910755-714b-4340-a352-86850dc4f72b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
        
           
                
                   
                
            
            
                
                    
                    
                    
                        Browser Anda tidak Support untuk Aplikasi ini mohon untuk upgrade ke yang terbaru
                    
                
            
        
    



	

    .pe-none{
        pointer-events : none;
    }



Product Tour
Panduan User/CS





    (function(){
        // alert(&quot;&quot;);
        if(&quot;&quot;){
            // alert(&quot;Test&quot;);
            $(&quot;#floatingButton&quot;).removeClass(&quot;d-none&quot;);
        } else {
            // $(&quot;.tawk-min-container&quot;).addClass(&quot;d-none&quot;);
            // alert(&quot;Log Masuk ?&quot;);
            
            var Tawk_API=Tawk_API||{};
            Tawk_API.visitor = {
                name : &quot;&quot;,
                email : &quot;&quot;
            };
            //alert(&quot;&quot;);
            //email root itprogrammer@azlogistik.com


            var Tawk_API=Tawk_API||{}, Tawk_LoadStart=new Date();

            
            var s1=document.createElement(&quot;script&quot;),s0=document.getElementsByTagName(&quot;script&quot;)[0];
            s1.async=true;
            s1.src='https://embed.tawk.to/638eaf9eb0d6371309d2cc20/1gjils1hg';
            s1.charset='UTF-8';
            s1.setAttribute('crossorigin','*');
            s0.parentNode.insertBefore(s1,s0);
            
        }
    
        $(&quot;body&quot;).on(&quot;click&quot;,&quot;#floatingButton&quot;,function(e) {
            $(&quot;.productTour&quot;).toggleClass(&quot;d-none&quot;);
            $(&quot;.panduanUser&quot;).toggleClass(&quot;d-none&quot;);
        });

        $(&quot;body&quot;).on(&quot;click&quot;,&quot;.productTour&quot;,function(e) {
            runWebtour();
        });

        function end_session(){
            var test = document.querySelectorAll(&quot;.tawk-form-wrapper > email&quot;);
            window.Tawk_API.endChat();
            window.Tawk_API.onload = function(){
                window.Tawk_API.endChat();
            }
        }

    })();

 
	
		
	
	
    function random_string(length){
        // alert('a');
        let result = '';
        const characters = '1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM';
        const characters_length = characters.length;
        let counter = 0;
        // alert('b');
        while (counter &lt; length) {
            result += characters.charAt(Math.floor(Math.random() * characters_length));
            counter += 1;
        }
        // alert('f');
        return result;
    }

    $(document).ready(function(){
        $(&quot;#btnMintaRequest&quot;).on(&quot;click&quot;,function(){

            // localStorage.setItem('CookiesToken', random_string(100));
            // var cookies_token = localStorage.getItem('CookiesToken');
            var cookies_token = `c3LhqZImtbVp2X4tpy2j94lVKU6xCPvViwvKfwsy4QSXSt7hOwUDvfsFXnwMiCA4AEqVuAxUHN2KOsGyWQmdSo8yJkxKjHTsY1Zj`;

            $.ajax({
                url: &quot;https://rc.azlogistik.id/api/insert_whitelist&quot;,
                type: &quot;post&quot;,
                data:{
                    CookiesToken: cookies_token,
                    RequesterName: $(&quot;#inputRequester&quot;).val()
                },
                async:false,
                dataType:&quot;json&quot;,
                success:function(result){
                    $(&quot;#info&quot;).text(result[&quot;Data&quot;][&quot;Message&quot;]);
                }
            })
        });
        $(&quot;#btnLogin&quot;).on(&quot;click&quot;,function(){
            window.location=&quot;http://rc.azlogistik.id/login&quot;;
        });
        
    })


Anda belum mendapatkan ijin verifikasi untuk bisa mengakses muatmuat.
Silahkan isi nama anda dan tunggu verifikasi dari admin backoffice

    
    
        Nama:  
        
    
    
        Minta Request
    
    
        Login
    
    


	
	
	
	
	
	
	
	
	

	

	
	

	
		// $(document).ajaxStart(function(){
		//    
		// });

		// $(document).ajaxStop(function(){
		//     $.LoadingOverlay(&quot;hide&quot;);
		// });

		$(document).ajaxError(function(){
		    $.LoadingOverlay(&quot;hide&quot;);
		    alert(&quot;Terjadi Kesalahan Server!&quot;);
		});
		$(document).ready(function(){
			let formatCur = {mDec:0 , aSep:'.', aDec:',', aSign:'Rp.', vMin:'0'};
			let formatNumber = {mDec:0 , aSep:'.', aDec:',', vMin:'0'};
			let formatUnitTruk = {mDec:0 , aSep:',', aDec:'.', vMin:'0'};
			let formatPersen = {mDec:0 , aSep:'.', aDec:',', vMin:'0', vMax:'100'};
			let formatCooke = {mDec:0 , aSep:'', aDec:',',vMin:'0', vMax:'9999'};
            let formatSatuan = {mDec:0 , aSep:'.', aDec:',',vMin:'0', vMax:'99'};
            let formatBerat = {mDec:2 , aSep:'.', aDec:',',vMin:'0', vMax:'999.99'};
            let formatDimensi = {mDec:2 , aSep:'.', aDec:',',vMin:'0', vMax:'99.99'};
            let formatJumlahTruk = {mDec:0 , aSep:'.', aDec:',',vMin:'0', vMax:'10000'};
            let formatNumberDesimal = {mDec:2 , aSep:'.', aDec:',', vMin:'0'};
            let formatNumber3DigitAfterComma = {mDec:3 , aSep:'.', aDec:',', vMin:'0'};
			
			$('.formatCur').autoNumeric('init', formatCur);
			$('.formatNumber').autoNumeric('init', formatNumber);			
			$('.formatUnitTruk').autoNumeric('init', formatUnitTruk);			
			$('.formatNumberDesimal').autoNumeric('init', formatNumberDesimal);			
			$('.formatPersen').autoNumeric('init', formatPersen);	
			$('.formatCooke').autoNumeric('init', formatCooke);
			$('.formatBerat').autoNumeric('init', formatBerat);
			$('.formatDimensi').autoNumeric('init', formatDimensi);
			$('.formatJumlahTruk').autoNumeric('init', formatJumlahTruk);

			$('.format-number-3-digit-after-comma').autoNumeric('init', formatNumber3DigitAfterComma);
			$('.selectSearch').select2();

			$('.input-required').each(function(key, index){
				$(index).append(`&lt;span class='required-text'> *&lt;/span>`);
			})

			$(document).find('input[type=&quot;checkbox&quot;]').each(function(key, index){
                $(index).addClass('fi-checkbox');
            })

            $(document).find('input[type=&quot;radio&quot;]').each(function(key, index){
                $(index).addClass('fi-radio');
            })

			$(document).on('change','.selectSearch', function(){
				
				let val = $(this).val()[0];								
				$(this).find('option').each(function(key, option){					
					if(val == 'all'){
						if($(this).val() != 'all'){							
							$(this).prop('disabled', true);															
						}
					}else if(val == undefined){
						$(this).prop('disabled', false);
					}else{
						if($(this).val() != 'all'){
							$(this).prop('disabled', false);
						}else{
							$(this).prop('disabled', true);
						}
					}
				});

				$('.selectSearch').select2();				
			});			

			$(document).on('click','#batal', function(e){             	            
	            let textAlert = 'Perubahan tidak akan disimpan dan akan kembali ke halaman sebelumnya';	            
	            Swal.fire({
	                title: 'Apakah Anda Yakin ?',
	                text: textAlert,
	                type: 'warning',
	                showCancelButton: true,
	                confirmButtonColor: '#3085d6',
	                cancelButtonColor: '#d33',
	                confirmButtonText: 'Ya',
	                cancelButtonText: 'Tidak'
	            }).then((result) => {
	                if (result.value) {
	                  window.history.back();                 
	                }
	            });        
	        });  

	        $('#form').submit(function(){
	        	Swal.fire(
                   	'Data berhasil disimpan',
                    '',
                    'success',
                );

                $('button[text=&quot;Submit&quot;]').prop('disabled', true);
	        });

	         $('.hanya_angka').keypress(function(e){	          
	            if(e.which != 8 &amp;&amp; e.which != 0 &amp;&amp; (e.which &lt; 48 || e.which > 57)){
	              zemPopover(this, &quot;Masukan hanya angka&quot;);
	              return false;
	            }
	         });

	        $(document).on('click', '.btn-close-msg', function(){
            	let url= '/id/tan/';
            	let type = $(this).data('type');
            	let parents = $(this).parents('.col-lg-12');
            	$.ajax({
            		url : url+&quot;close_info_pratender&quot;,
            		dataType : &quot;json&quot;,
            		type : &quot;post&quot;,
            		data : {
            			type : type
            		},
            		success: function(data){                			
            			parents.remove();

            			let sisaMsg = $('.btn-close-msg').length;
            			if(sisaMsg == 0){
            				let isian = `                				
            					&lt;div class=&quot;center-screen&quot; style=&quot;width: 100%; margin-top: 102px&quot;>
						            &lt;div style=&quot;max-width: 221px&quot;>
						              &lt;img src=&quot;/_resources/themes/muat/image/svg/Group 40072.svg&quot; class=&quot;mx-auto d-block&quot; style=&quot;height: 147px&quot; />
						              &lt;p class=&quot;fc-86 ff-demi fs-18 text-center&quot; style=&quot;margin-top: 20px; max-width: 225px;&quot;>Belum Ada&lt;br>Info Pra Tender&lt;/p>
						            &lt;/div>
						        &lt;/div>`;

						    $('#isian > div > div').append(isian);

            			}
            		}

            	})
            	
            });

            $(document).on(&quot;change&quot;, &quot;.formatedDate&quot;, function() {
    			if($(this).val() != ''){
			      $(this).attr(
			          &quot;data-date&quot;,
			          moment($(this).val(), &quot;YYYY-MM-DD&quot;).locale('id')
			          .format( $(this).attr(&quot;data-date-format&quot;) )
    			
			    	)
			  	}
			 });
		});

		
	
	
	
	

/html[1]/body[1]</value>
      <webElementGuid>f7bf63ed-0f98-4cd3-a559-d06291d2cb2a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
      <webElementGuid>81df0130-7d49-497c-bc14-f2b2be3fbea2</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>2157fa67-c7e2-4bdb-8b7c-fd76452d3eb3</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;
    
        
           
                
                   
                
            
            
                
                    
                    
                    
                        Browser Anda tidak Support untuk Aplikasi ini mohon untuk upgrade ke yang terbaru
                    
                
            
        
    



	

    .pe-none{
        pointer-events : none;
    }



Product Tour
Panduan User/CS





    (function(){
        // alert(&quot;&quot;);
        if(&quot;&quot;){
            // alert(&quot;Test&quot;);
            $(&quot;#floatingButton&quot;).removeClass(&quot;d-none&quot;);
        } else {
            // $(&quot;.tawk-min-container&quot;).addClass(&quot;d-none&quot;);
            // alert(&quot;Log Masuk ?&quot;);
            
            var Tawk_API=Tawk_API||{};
            Tawk_API.visitor = {
                name : &quot;&quot;,
                email : &quot;&quot;
            };
            //alert(&quot;&quot;);
            //email root itprogrammer@azlogistik.com


            var Tawk_API=Tawk_API||{}, Tawk_LoadStart=new Date();

            
            var s1=document.createElement(&quot;script&quot;),s0=document.getElementsByTagName(&quot;script&quot;)[0];
            s1.async=true;
            s1.src=&quot; , &quot;'&quot; , &quot;https://embed.tawk.to/638eaf9eb0d6371309d2cc20/1gjils1hg&quot; , &quot;'&quot; , &quot;;
            s1.charset=&quot; , &quot;'&quot; , &quot;UTF-8&quot; , &quot;'&quot; , &quot;;
            s1.setAttribute(&quot; , &quot;'&quot; , &quot;crossorigin&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;*&quot; , &quot;'&quot; , &quot;);
            s0.parentNode.insertBefore(s1,s0);
            
        }
    
        $(&quot;body&quot;).on(&quot;click&quot;,&quot;#floatingButton&quot;,function(e) {
            $(&quot;.productTour&quot;).toggleClass(&quot;d-none&quot;);
            $(&quot;.panduanUser&quot;).toggleClass(&quot;d-none&quot;);
        });

        $(&quot;body&quot;).on(&quot;click&quot;,&quot;.productTour&quot;,function(e) {
            runWebtour();
        });

        function end_session(){
            var test = document.querySelectorAll(&quot;.tawk-form-wrapper > email&quot;);
            window.Tawk_API.endChat();
            window.Tawk_API.onload = function(){
                window.Tawk_API.endChat();
            }
        }

    })();

 
	
		
	
	
    function random_string(length){
        // alert(&quot; , &quot;'&quot; , &quot;a&quot; , &quot;'&quot; , &quot;);
        let result = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
        const characters = &quot; , &quot;'&quot; , &quot;1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM&quot; , &quot;'&quot; , &quot;;
        const characters_length = characters.length;
        let counter = 0;
        // alert(&quot; , &quot;'&quot; , &quot;b&quot; , &quot;'&quot; , &quot;);
        while (counter &lt; length) {
            result += characters.charAt(Math.floor(Math.random() * characters_length));
            counter += 1;
        }
        // alert(&quot; , &quot;'&quot; , &quot;f&quot; , &quot;'&quot; , &quot;);
        return result;
    }

    $(document).ready(function(){
        $(&quot;#btnMintaRequest&quot;).on(&quot;click&quot;,function(){

            // localStorage.setItem(&quot; , &quot;'&quot; , &quot;CookiesToken&quot; , &quot;'&quot; , &quot;, random_string(100));
            // var cookies_token = localStorage.getItem(&quot; , &quot;'&quot; , &quot;CookiesToken&quot; , &quot;'&quot; , &quot;);
            var cookies_token = `c3LhqZImtbVp2X4tpy2j94lVKU6xCPvViwvKfwsy4QSXSt7hOwUDvfsFXnwMiCA4AEqVuAxUHN2KOsGyWQmdSo8yJkxKjHTsY1Zj`;

            $.ajax({
                url: &quot;https://rc.azlogistik.id/api/insert_whitelist&quot;,
                type: &quot;post&quot;,
                data:{
                    CookiesToken: cookies_token,
                    RequesterName: $(&quot;#inputRequester&quot;).val()
                },
                async:false,
                dataType:&quot;json&quot;,
                success:function(result){
                    $(&quot;#info&quot;).text(result[&quot;Data&quot;][&quot;Message&quot;]);
                }
            })
        });
        $(&quot;#btnLogin&quot;).on(&quot;click&quot;,function(){
            window.location=&quot;http://rc.azlogistik.id/login&quot;;
        });
        
    })


Anda belum mendapatkan ijin verifikasi untuk bisa mengakses muatmuat.
Silahkan isi nama anda dan tunggu verifikasi dari admin backoffice

    
    
        Nama:  
        
    
    
        Minta Request
    
    
        Login
    
    


	
	
	
	
	
	
	
	
	

	

	
	

	
		// $(document).ajaxStart(function(){
		//    
		// });

		// $(document).ajaxStop(function(){
		//     $.LoadingOverlay(&quot;hide&quot;);
		// });

		$(document).ajaxError(function(){
		    $.LoadingOverlay(&quot;hide&quot;);
		    alert(&quot;Terjadi Kesalahan Server!&quot;);
		});
		$(document).ready(function(){
			let formatCur = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, aSign:&quot; , &quot;'&quot; , &quot;Rp.&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;};
			let formatNumber = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;};
			let formatUnitTruk = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;};
			let formatPersen = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;100&quot; , &quot;'&quot; , &quot;};
			let formatCooke = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;9999&quot; , &quot;'&quot; , &quot;};
            let formatSatuan = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;99&quot; , &quot;'&quot; , &quot;};
            let formatBerat = {mDec:2 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;999.99&quot; , &quot;'&quot; , &quot;};
            let formatDimensi = {mDec:2 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;99.99&quot; , &quot;'&quot; , &quot;};
            let formatJumlahTruk = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;10000&quot; , &quot;'&quot; , &quot;};
            let formatNumberDesimal = {mDec:2 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;};
            let formatNumber3DigitAfterComma = {mDec:3 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;};
			
			$(&quot; , &quot;'&quot; , &quot;.formatCur&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatCur);
			$(&quot; , &quot;'&quot; , &quot;.formatNumber&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatNumber);			
			$(&quot; , &quot;'&quot; , &quot;.formatUnitTruk&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatUnitTruk);			
			$(&quot; , &quot;'&quot; , &quot;.formatNumberDesimal&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatNumberDesimal);			
			$(&quot; , &quot;'&quot; , &quot;.formatPersen&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatPersen);	
			$(&quot; , &quot;'&quot; , &quot;.formatCooke&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatCooke);
			$(&quot; , &quot;'&quot; , &quot;.formatBerat&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatBerat);
			$(&quot; , &quot;'&quot; , &quot;.formatDimensi&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatDimensi);
			$(&quot; , &quot;'&quot; , &quot;.formatJumlahTruk&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatJumlahTruk);

			$(&quot; , &quot;'&quot; , &quot;.format-number-3-digit-after-comma&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatNumber3DigitAfterComma);
			$(&quot; , &quot;'&quot; , &quot;.selectSearch&quot; , &quot;'&quot; , &quot;).select2();

			$(&quot; , &quot;'&quot; , &quot;.input-required&quot; , &quot;'&quot; , &quot;).each(function(key, index){
				$(index).append(`&lt;span class=&quot; , &quot;'&quot; , &quot;required-text&quot; , &quot;'&quot; , &quot;> *&lt;/span>`);
			})

			$(document).find(&quot; , &quot;'&quot; , &quot;input[type=&quot;checkbox&quot;]&quot; , &quot;'&quot; , &quot;).each(function(key, index){
                $(index).addClass(&quot; , &quot;'&quot; , &quot;fi-checkbox&quot; , &quot;'&quot; , &quot;);
            })

            $(document).find(&quot; , &quot;'&quot; , &quot;input[type=&quot;radio&quot;]&quot; , &quot;'&quot; , &quot;).each(function(key, index){
                $(index).addClass(&quot; , &quot;'&quot; , &quot;fi-radio&quot; , &quot;'&quot; , &quot;);
            })

			$(document).on(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;.selectSearch&quot; , &quot;'&quot; , &quot;, function(){
				
				let val = $(this).val()[0];								
				$(this).find(&quot; , &quot;'&quot; , &quot;option&quot; , &quot;'&quot; , &quot;).each(function(key, option){					
					if(val == &quot; , &quot;'&quot; , &quot;all&quot; , &quot;'&quot; , &quot;){
						if($(this).val() != &quot; , &quot;'&quot; , &quot;all&quot; , &quot;'&quot; , &quot;){							
							$(this).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, true);															
						}
					}else if(val == undefined){
						$(this).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, false);
					}else{
						if($(this).val() != &quot; , &quot;'&quot; , &quot;all&quot; , &quot;'&quot; , &quot;){
							$(this).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, false);
						}else{
							$(this).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, true);
						}
					}
				});

				$(&quot; , &quot;'&quot; , &quot;.selectSearch&quot; , &quot;'&quot; , &quot;).select2();				
			});			

			$(document).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;#batal&quot; , &quot;'&quot; , &quot;, function(e){             	            
	            let textAlert = &quot; , &quot;'&quot; , &quot;Perubahan tidak akan disimpan dan akan kembali ke halaman sebelumnya&quot; , &quot;'&quot; , &quot;;	            
	            Swal.fire({
	                title: &quot; , &quot;'&quot; , &quot;Apakah Anda Yakin ?&quot; , &quot;'&quot; , &quot;,
	                text: textAlert,
	                type: &quot; , &quot;'&quot; , &quot;warning&quot; , &quot;'&quot; , &quot;,
	                showCancelButton: true,
	                confirmButtonColor: &quot; , &quot;'&quot; , &quot;#3085d6&quot; , &quot;'&quot; , &quot;,
	                cancelButtonColor: &quot; , &quot;'&quot; , &quot;#d33&quot; , &quot;'&quot; , &quot;,
	                confirmButtonText: &quot; , &quot;'&quot; , &quot;Ya&quot; , &quot;'&quot; , &quot;,
	                cancelButtonText: &quot; , &quot;'&quot; , &quot;Tidak&quot; , &quot;'&quot; , &quot;
	            }).then((result) => {
	                if (result.value) {
	                  window.history.back();                 
	                }
	            });        
	        });  

	        $(&quot; , &quot;'&quot; , &quot;#form&quot; , &quot;'&quot; , &quot;).submit(function(){
	        	Swal.fire(
                   	&quot; , &quot;'&quot; , &quot;Data berhasil disimpan&quot; , &quot;'&quot; , &quot;,
                    &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,
                    &quot; , &quot;'&quot; , &quot;success&quot; , &quot;'&quot; , &quot;,
                );

                $(&quot; , &quot;'&quot; , &quot;button[text=&quot;Submit&quot;]&quot; , &quot;'&quot; , &quot;).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, true);
	        });

	         $(&quot; , &quot;'&quot; , &quot;.hanya_angka&quot; , &quot;'&quot; , &quot;).keypress(function(e){	          
	            if(e.which != 8 &amp;&amp; e.which != 0 &amp;&amp; (e.which &lt; 48 || e.which > 57)){
	              zemPopover(this, &quot;Masukan hanya angka&quot;);
	              return false;
	            }
	         });

	        $(document).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;.btn-close-msg&quot; , &quot;'&quot; , &quot;, function(){
            	let url= &quot; , &quot;'&quot; , &quot;/id/tan/&quot; , &quot;'&quot; , &quot;;
            	let type = $(this).data(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;);
            	let parents = $(this).parents(&quot; , &quot;'&quot; , &quot;.col-lg-12&quot; , &quot;'&quot; , &quot;);
            	$.ajax({
            		url : url+&quot;close_info_pratender&quot;,
            		dataType : &quot;json&quot;,
            		type : &quot;post&quot;,
            		data : {
            			type : type
            		},
            		success: function(data){                			
            			parents.remove();

            			let sisaMsg = $(&quot; , &quot;'&quot; , &quot;.btn-close-msg&quot; , &quot;'&quot; , &quot;).length;
            			if(sisaMsg == 0){
            				let isian = `                				
            					&lt;div class=&quot;center-screen&quot; style=&quot;width: 100%; margin-top: 102px&quot;>
						            &lt;div style=&quot;max-width: 221px&quot;>
						              &lt;img src=&quot;/_resources/themes/muat/image/svg/Group 40072.svg&quot; class=&quot;mx-auto d-block&quot; style=&quot;height: 147px&quot; />
						              &lt;p class=&quot;fc-86 ff-demi fs-18 text-center&quot; style=&quot;margin-top: 20px; max-width: 225px;&quot;>Belum Ada&lt;br>Info Pra Tender&lt;/p>
						            &lt;/div>
						        &lt;/div>`;

						    $(&quot; , &quot;'&quot; , &quot;#isian > div > div&quot; , &quot;'&quot; , &quot;).append(isian);

            			}
            		}

            	})
            	
            });

            $(document).on(&quot;change&quot;, &quot;.formatedDate&quot;, function() {
    			if($(this).val() != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
			      $(this).attr(
			          &quot;data-date&quot;,
			          moment($(this).val(), &quot;YYYY-MM-DD&quot;).locale(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;)
			          .format( $(this).attr(&quot;data-date-format&quot;) )
    			
			    	)
			  	}
			 });
		});

		
	
	
	
	

/html[1]/body[1]&quot;) or . = concat(&quot;
    
        
           
                
                   
                
            
            
                
                    
                    
                    
                        Browser Anda tidak Support untuk Aplikasi ini mohon untuk upgrade ke yang terbaru
                    
                
            
        
    



	

    .pe-none{
        pointer-events : none;
    }



Product Tour
Panduan User/CS





    (function(){
        // alert(&quot;&quot;);
        if(&quot;&quot;){
            // alert(&quot;Test&quot;);
            $(&quot;#floatingButton&quot;).removeClass(&quot;d-none&quot;);
        } else {
            // $(&quot;.tawk-min-container&quot;).addClass(&quot;d-none&quot;);
            // alert(&quot;Log Masuk ?&quot;);
            
            var Tawk_API=Tawk_API||{};
            Tawk_API.visitor = {
                name : &quot;&quot;,
                email : &quot;&quot;
            };
            //alert(&quot;&quot;);
            //email root itprogrammer@azlogistik.com


            var Tawk_API=Tawk_API||{}, Tawk_LoadStart=new Date();

            
            var s1=document.createElement(&quot;script&quot;),s0=document.getElementsByTagName(&quot;script&quot;)[0];
            s1.async=true;
            s1.src=&quot; , &quot;'&quot; , &quot;https://embed.tawk.to/638eaf9eb0d6371309d2cc20/1gjils1hg&quot; , &quot;'&quot; , &quot;;
            s1.charset=&quot; , &quot;'&quot; , &quot;UTF-8&quot; , &quot;'&quot; , &quot;;
            s1.setAttribute(&quot; , &quot;'&quot; , &quot;crossorigin&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;*&quot; , &quot;'&quot; , &quot;);
            s0.parentNode.insertBefore(s1,s0);
            
        }
    
        $(&quot;body&quot;).on(&quot;click&quot;,&quot;#floatingButton&quot;,function(e) {
            $(&quot;.productTour&quot;).toggleClass(&quot;d-none&quot;);
            $(&quot;.panduanUser&quot;).toggleClass(&quot;d-none&quot;);
        });

        $(&quot;body&quot;).on(&quot;click&quot;,&quot;.productTour&quot;,function(e) {
            runWebtour();
        });

        function end_session(){
            var test = document.querySelectorAll(&quot;.tawk-form-wrapper > email&quot;);
            window.Tawk_API.endChat();
            window.Tawk_API.onload = function(){
                window.Tawk_API.endChat();
            }
        }

    })();

 
	
		
	
	
    function random_string(length){
        // alert(&quot; , &quot;'&quot; , &quot;a&quot; , &quot;'&quot; , &quot;);
        let result = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
        const characters = &quot; , &quot;'&quot; , &quot;1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM&quot; , &quot;'&quot; , &quot;;
        const characters_length = characters.length;
        let counter = 0;
        // alert(&quot; , &quot;'&quot; , &quot;b&quot; , &quot;'&quot; , &quot;);
        while (counter &lt; length) {
            result += characters.charAt(Math.floor(Math.random() * characters_length));
            counter += 1;
        }
        // alert(&quot; , &quot;'&quot; , &quot;f&quot; , &quot;'&quot; , &quot;);
        return result;
    }

    $(document).ready(function(){
        $(&quot;#btnMintaRequest&quot;).on(&quot;click&quot;,function(){

            // localStorage.setItem(&quot; , &quot;'&quot; , &quot;CookiesToken&quot; , &quot;'&quot; , &quot;, random_string(100));
            // var cookies_token = localStorage.getItem(&quot; , &quot;'&quot; , &quot;CookiesToken&quot; , &quot;'&quot; , &quot;);
            var cookies_token = `c3LhqZImtbVp2X4tpy2j94lVKU6xCPvViwvKfwsy4QSXSt7hOwUDvfsFXnwMiCA4AEqVuAxUHN2KOsGyWQmdSo8yJkxKjHTsY1Zj`;

            $.ajax({
                url: &quot;https://rc.azlogistik.id/api/insert_whitelist&quot;,
                type: &quot;post&quot;,
                data:{
                    CookiesToken: cookies_token,
                    RequesterName: $(&quot;#inputRequester&quot;).val()
                },
                async:false,
                dataType:&quot;json&quot;,
                success:function(result){
                    $(&quot;#info&quot;).text(result[&quot;Data&quot;][&quot;Message&quot;]);
                }
            })
        });
        $(&quot;#btnLogin&quot;).on(&quot;click&quot;,function(){
            window.location=&quot;http://rc.azlogistik.id/login&quot;;
        });
        
    })


Anda belum mendapatkan ijin verifikasi untuk bisa mengakses muatmuat.
Silahkan isi nama anda dan tunggu verifikasi dari admin backoffice

    
    
        Nama:  
        
    
    
        Minta Request
    
    
        Login
    
    


	
	
	
	
	
	
	
	
	

	

	
	

	
		// $(document).ajaxStart(function(){
		//    
		// });

		// $(document).ajaxStop(function(){
		//     $.LoadingOverlay(&quot;hide&quot;);
		// });

		$(document).ajaxError(function(){
		    $.LoadingOverlay(&quot;hide&quot;);
		    alert(&quot;Terjadi Kesalahan Server!&quot;);
		});
		$(document).ready(function(){
			let formatCur = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, aSign:&quot; , &quot;'&quot; , &quot;Rp.&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;};
			let formatNumber = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;};
			let formatUnitTruk = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;};
			let formatPersen = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;100&quot; , &quot;'&quot; , &quot;};
			let formatCooke = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;9999&quot; , &quot;'&quot; , &quot;};
            let formatSatuan = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;99&quot; , &quot;'&quot; , &quot;};
            let formatBerat = {mDec:2 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;999.99&quot; , &quot;'&quot; , &quot;};
            let formatDimensi = {mDec:2 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;99.99&quot; , &quot;'&quot; , &quot;};
            let formatJumlahTruk = {mDec:0 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;, vMax:&quot; , &quot;'&quot; , &quot;10000&quot; , &quot;'&quot; , &quot;};
            let formatNumberDesimal = {mDec:2 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;};
            let formatNumber3DigitAfterComma = {mDec:3 , aSep:&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;, aDec:&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;, vMin:&quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;};
			
			$(&quot; , &quot;'&quot; , &quot;.formatCur&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatCur);
			$(&quot; , &quot;'&quot; , &quot;.formatNumber&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatNumber);			
			$(&quot; , &quot;'&quot; , &quot;.formatUnitTruk&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatUnitTruk);			
			$(&quot; , &quot;'&quot; , &quot;.formatNumberDesimal&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatNumberDesimal);			
			$(&quot; , &quot;'&quot; , &quot;.formatPersen&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatPersen);	
			$(&quot; , &quot;'&quot; , &quot;.formatCooke&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatCooke);
			$(&quot; , &quot;'&quot; , &quot;.formatBerat&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatBerat);
			$(&quot; , &quot;'&quot; , &quot;.formatDimensi&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatDimensi);
			$(&quot; , &quot;'&quot; , &quot;.formatJumlahTruk&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatJumlahTruk);

			$(&quot; , &quot;'&quot; , &quot;.format-number-3-digit-after-comma&quot; , &quot;'&quot; , &quot;).autoNumeric(&quot; , &quot;'&quot; , &quot;init&quot; , &quot;'&quot; , &quot;, formatNumber3DigitAfterComma);
			$(&quot; , &quot;'&quot; , &quot;.selectSearch&quot; , &quot;'&quot; , &quot;).select2();

			$(&quot; , &quot;'&quot; , &quot;.input-required&quot; , &quot;'&quot; , &quot;).each(function(key, index){
				$(index).append(`&lt;span class=&quot; , &quot;'&quot; , &quot;required-text&quot; , &quot;'&quot; , &quot;> *&lt;/span>`);
			})

			$(document).find(&quot; , &quot;'&quot; , &quot;input[type=&quot;checkbox&quot;]&quot; , &quot;'&quot; , &quot;).each(function(key, index){
                $(index).addClass(&quot; , &quot;'&quot; , &quot;fi-checkbox&quot; , &quot;'&quot; , &quot;);
            })

            $(document).find(&quot; , &quot;'&quot; , &quot;input[type=&quot;radio&quot;]&quot; , &quot;'&quot; , &quot;).each(function(key, index){
                $(index).addClass(&quot; , &quot;'&quot; , &quot;fi-radio&quot; , &quot;'&quot; , &quot;);
            })

			$(document).on(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;.selectSearch&quot; , &quot;'&quot; , &quot;, function(){
				
				let val = $(this).val()[0];								
				$(this).find(&quot; , &quot;'&quot; , &quot;option&quot; , &quot;'&quot; , &quot;).each(function(key, option){					
					if(val == &quot; , &quot;'&quot; , &quot;all&quot; , &quot;'&quot; , &quot;){
						if($(this).val() != &quot; , &quot;'&quot; , &quot;all&quot; , &quot;'&quot; , &quot;){							
							$(this).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, true);															
						}
					}else if(val == undefined){
						$(this).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, false);
					}else{
						if($(this).val() != &quot; , &quot;'&quot; , &quot;all&quot; , &quot;'&quot; , &quot;){
							$(this).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, false);
						}else{
							$(this).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, true);
						}
					}
				});

				$(&quot; , &quot;'&quot; , &quot;.selectSearch&quot; , &quot;'&quot; , &quot;).select2();				
			});			

			$(document).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;#batal&quot; , &quot;'&quot; , &quot;, function(e){             	            
	            let textAlert = &quot; , &quot;'&quot; , &quot;Perubahan tidak akan disimpan dan akan kembali ke halaman sebelumnya&quot; , &quot;'&quot; , &quot;;	            
	            Swal.fire({
	                title: &quot; , &quot;'&quot; , &quot;Apakah Anda Yakin ?&quot; , &quot;'&quot; , &quot;,
	                text: textAlert,
	                type: &quot; , &quot;'&quot; , &quot;warning&quot; , &quot;'&quot; , &quot;,
	                showCancelButton: true,
	                confirmButtonColor: &quot; , &quot;'&quot; , &quot;#3085d6&quot; , &quot;'&quot; , &quot;,
	                cancelButtonColor: &quot; , &quot;'&quot; , &quot;#d33&quot; , &quot;'&quot; , &quot;,
	                confirmButtonText: &quot; , &quot;'&quot; , &quot;Ya&quot; , &quot;'&quot; , &quot;,
	                cancelButtonText: &quot; , &quot;'&quot; , &quot;Tidak&quot; , &quot;'&quot; , &quot;
	            }).then((result) => {
	                if (result.value) {
	                  window.history.back();                 
	                }
	            });        
	        });  

	        $(&quot; , &quot;'&quot; , &quot;#form&quot; , &quot;'&quot; , &quot;).submit(function(){
	        	Swal.fire(
                   	&quot; , &quot;'&quot; , &quot;Data berhasil disimpan&quot; , &quot;'&quot; , &quot;,
                    &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,
                    &quot; , &quot;'&quot; , &quot;success&quot; , &quot;'&quot; , &quot;,
                );

                $(&quot; , &quot;'&quot; , &quot;button[text=&quot;Submit&quot;]&quot; , &quot;'&quot; , &quot;).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, true);
	        });

	         $(&quot; , &quot;'&quot; , &quot;.hanya_angka&quot; , &quot;'&quot; , &quot;).keypress(function(e){	          
	            if(e.which != 8 &amp;&amp; e.which != 0 &amp;&amp; (e.which &lt; 48 || e.which > 57)){
	              zemPopover(this, &quot;Masukan hanya angka&quot;);
	              return false;
	            }
	         });

	        $(document).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;.btn-close-msg&quot; , &quot;'&quot; , &quot;, function(){
            	let url= &quot; , &quot;'&quot; , &quot;/id/tan/&quot; , &quot;'&quot; , &quot;;
            	let type = $(this).data(&quot; , &quot;'&quot; , &quot;type&quot; , &quot;'&quot; , &quot;);
            	let parents = $(this).parents(&quot; , &quot;'&quot; , &quot;.col-lg-12&quot; , &quot;'&quot; , &quot;);
            	$.ajax({
            		url : url+&quot;close_info_pratender&quot;,
            		dataType : &quot;json&quot;,
            		type : &quot;post&quot;,
            		data : {
            			type : type
            		},
            		success: function(data){                			
            			parents.remove();

            			let sisaMsg = $(&quot; , &quot;'&quot; , &quot;.btn-close-msg&quot; , &quot;'&quot; , &quot;).length;
            			if(sisaMsg == 0){
            				let isian = `                				
            					&lt;div class=&quot;center-screen&quot; style=&quot;width: 100%; margin-top: 102px&quot;>
						            &lt;div style=&quot;max-width: 221px&quot;>
						              &lt;img src=&quot;/_resources/themes/muat/image/svg/Group 40072.svg&quot; class=&quot;mx-auto d-block&quot; style=&quot;height: 147px&quot; />
						              &lt;p class=&quot;fc-86 ff-demi fs-18 text-center&quot; style=&quot;margin-top: 20px; max-width: 225px;&quot;>Belum Ada&lt;br>Info Pra Tender&lt;/p>
						            &lt;/div>
						        &lt;/div>`;

						    $(&quot; , &quot;'&quot; , &quot;#isian > div > div&quot; , &quot;'&quot; , &quot;).append(isian);

            			}
            		}

            	})
            	
            });

            $(document).on(&quot;change&quot;, &quot;.formatedDate&quot;, function() {
    			if($(this).val() != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
			      $(this).attr(
			          &quot;data-date&quot;,
			          moment($(this).val(), &quot;YYYY-MM-DD&quot;).locale(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;)
			          .format( $(this).attr(&quot;data-date-format&quot;) )
    			
			    	)
			  	}
			 });
		});

		
	
	
	
	

/html[1]/body[1]&quot;))]</value>
      <webElementGuid>87292f4e-9add-4231-8727-204c5727df54</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
