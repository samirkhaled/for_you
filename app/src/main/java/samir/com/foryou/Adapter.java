 package samir.com.foryou;

 import android.content.Context;
 import android.view.LayoutInflater;
 import android.view.View;
 import android.view.ViewGroup;
 import android.widget.ImageView;
 import android.widget.TextView;
 import android.widget.Toast;
 import androidx.cardview.widget.CardView;
 import androidx.recyclerview.widget.RecyclerView;

 public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolders> {
     private  String[] namesArray;
     private int [] photo_array;
     private Context context;
     public Adapter(Context co, String [] name , int[] p_array){
         this.context=co;
         this.namesArray=name;
         this.photo_array=p_array;
     }

     @Override
     public ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
         View row= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
         ViewHolders holder =new ViewHolders(row);
         return holder;

     }
     @Override
     public void onBindViewHolder(ViewHolders holder, final int position) {
         // وضع الاسم فى مكان الاسماء
         holder.TextName.setText(namesArray[position]);
         holder.photo.setImageResource(photo_array[position]);

         // الحدث عند الضغط
         holder.card.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(context,namesArray[position] +"position is"+" "+position, Toast.LENGTH_SHORT).show();
             }
         });


     }


     @Override
     public int getItemCount() {
         return namesArray.length;

     }
     public class ViewHolders extends RecyclerView.ViewHolder {
         private TextView TextName;
         private ImageView photo ;
         private CardView card;
         public ViewHolders(View layout) {
             super(layout);
             TextName=(TextView)layout.findViewById(R.id.row_names);
             photo=(ImageView)layout.findViewById(R.id.photo);
             card=(CardView)layout.findViewById(R.id.card_cont);
         }
     }
 }