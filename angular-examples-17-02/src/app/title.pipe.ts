import{Pipe , PipeTransform} from '@angular/core'
import { transformAll } from '@angular/compiler/src/render3/r3_ast'
 @Pipe({
    name:'title'

 })

 export class TitlePipe implements PipeTransform{
 transform(value: String , egender: String ): String{
    if(egender=="M"){
            return "Mr."+value;
    }
    else{
        return"Mrs."+value;
    }




 }
 }




