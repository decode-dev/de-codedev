namespace MJ_Test
{
    partial class Range
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.frmtb = new System.Windows.Forms.TextBox();
            this.totb = new System.Windows.Forms.TextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.rstb = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label1.Location = new System.Drawing.Point(12, 25);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(57, 25);
            this.label1.TabIndex = 0;
            this.label1.Text = "From";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label2.Location = new System.Drawing.Point(385, 31);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(36, 25);
            this.label2.TabIndex = 1;
            this.label2.Text = "To";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // frmtb
            // 
            this.frmtb.Location = new System.Drawing.Point(113, 30);
            this.frmtb.Name = "frmtb";
            this.frmtb.Size = new System.Drawing.Size(152, 22);
            this.frmtb.TabIndex = 2;
            // 
            // totb
            // 
            this.totb.Location = new System.Drawing.Point(531, 34);
            this.totb.Name = "totb";
            this.totb.Size = new System.Drawing.Size(152, 22);
            this.totb.TabIndex = 3;
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F);
            this.button1.Location = new System.Drawing.Point(757, 31);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(93, 41);
            this.button1.TabIndex = 4;
            this.button1.Text = "Click Me!!";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Font = new System.Drawing.Font("Microsoft Sans Serif", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button2.Location = new System.Drawing.Point(790, 408);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(60, 45);
            this.button2.TabIndex = 6;
            this.button2.Text = ">";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // rstb
            // 
            this.rstb.Location = new System.Drawing.Point(60, 111);
            this.rstb.Multiline = true;
            this.rstb.Name = "rstb";
            this.rstb.Size = new System.Drawing.Size(756, 222);
            this.rstb.TabIndex = 8;
            // 
            // Range
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(881, 474);
            this.Controls.Add(this.rstb);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.totb);
            this.Controls.Add(this.frmtb);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Range";
            this.Text = "RegX";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox frmtb;
        private System.Windows.Forms.TextBox totb;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.TextBox rstb;
    }
}

