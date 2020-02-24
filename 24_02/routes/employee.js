const express = require('express')
const Employee = require('../models/employe.js')


const router = express.Router();


router.post("/" , async (req , res)=>{

    const emp = req.body;
    const doc = await Employee.create(emp)
    console.log(emp)

    try {
        console.log("post WORKING");
        res.status(201).json({
            error: false,
            data: doc
            
        }
        
        )
        
        
    } catch (err) {
        res.status(400).json({

            error:true,
            message:err.message
        })
        
    }


})


    router.get("/" , async(req , res)=>{

        const employees = await Employee.find();

        try {
            res.status(200).json({
                error:false,
                message: employees
            });
            
        } catch (err) {
            
            res.status(400).json({

                error:true,
                message: err.message

            });
        }


    })

    router.put("/:id" , async (req , res)=>{

        const employees = await Employee.findByIdAndUpdate(req.params.id , req.body , 
            { 
                new : true,
                runValidators:true


        })
       if(!employees){

        res.status(404).json({

            error: true,
            message: " Employee id does not exist"
        })
       }
       try {
           

        res.status(200).json({

            error : false,
            data: employees
        })
       } catch (err) {

        res.status(400).json({

            error: true,
            message: err.message
        })
           
       }


    })
    router.delete("/:id" , async (req , res)=>{

        const employees = await Employee.findByIdAndDelete(req.params.id)
       if(!employees){

        res.status(404).json({

            error: true,
            message: " Employee id does not exist"
        })
       }
       try {
           

        res.status(200).json({

            error : false,
            message:"delete"
        })
       } catch (err) {

        res.status(400).json({

            error: true,
            message: err.message
        })
           
       }


    })
    



    router.get('/:id' , (req , res)=>{

        let id= req.params.id;
        console.log("the id (morgan):"+id);

        res.status(200).json({

            error:false,
            message:'get emp with id:'+id
        })

    })
    
    module.exports = router;