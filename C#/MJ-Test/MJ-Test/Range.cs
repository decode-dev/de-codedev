using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MJ_Test
{
    public partial class Range : Form
    {
        public Range()
        {
            InitializeComponent();
            
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            int start= Int32.Parse(frmtb.Text.Trim());
            int end = Int32.Parse(totb.Text.Trim());
            for (int i = start; i <= end;i++ )
            {
                rstb.Text+=i + ",";
                
            }
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            MultiX mx = new MultiX();
            mx.Show();
            Hide();
        }
        
    }
}
